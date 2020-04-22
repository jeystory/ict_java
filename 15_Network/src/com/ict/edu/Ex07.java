package com.ict.edu;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Ex07 {
	public static void main(String[] args) {
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("Company");
			doc.appendChild(rootElement);
			// staff 엘리먼트
			Element staff = doc.createElement("Staff");
			rootElement.appendChild(staff);

			// 속성값 정의
			Attr attr = doc.createAttribute("id");
			attr.setValue("1");
			staff.setAttributeNode(attr);

			// 속성값을 정의하는 더 쉬운 방법
			// staff.setAttribute(“id”, “1”);

			// firstname 엘리먼트
			Element firstname = doc.createElement("firstname");
			firstname.appendChild(doc.createTextNode("Gildong"));
			staff.appendChild(firstname);

			// lastname 엘리먼트
			Element lastname = doc.createElement("lastname");
			lastname.appendChild(doc.createTextNode("Hong"));
			staff.appendChild(lastname);

			// nickname 엘리먼트
			Element nickname = doc.createElement("nickname");
			nickname.appendChild(doc.createTextNode("Mr.Hong"));
			staff.appendChild(nickname);

			// salary 엘리먼트
			Element salary = doc.createElement("salary");
			salary.appendChild(doc.createTextNode("100000"));
			staff.appendChild(salary);

			// XML 파일로 쓰기
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();

			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");	
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new FileOutputStream(new File("C:\\study\\util\\file.xml")));

			// 파일로 쓰지 않고 콘솔에 찍어보고 싶을 경우 다음을 사용 (디버깅용)
			// StreamResult result = new StreamResult(System.out);

			transformer.transform(source, result);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
