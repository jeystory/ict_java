package com.ict.edu;

public class Ex01_CollectionEx {
	/* ���ʴа� �÷���(�ڷᱸ��)
 	���ʴ� : �÷����� � ��ü��� �̷���������� ǥ���ϴ� ��ü Ÿ���� ���Ѵ�. ex) <��üŸ��>
 	�÷��� : ��ü���� ��Ƽ� ����(����)�ϴ� �������̽����� ���Ѵ�.
 	API���� ǥ�� : <T> => ��ü Ÿ��, <E> -> ���, �÷��� �ȿ� �����ϴ� ��ü �ϳ��� ���Ѵ�.
 				<K,V> -> �����Ŀ��� ������ ǥ��. K-> key, V->Value, key�� Value�� 1:1 ����. 
 				*** key�� ȣ���ϸ� value�� ����. (web���� ���� ���� ����ϴ� ����)
 	�ڷ��� ���� = ������ , �ڷ���[] ���� = {������, ������,.....};
 	���� : �÷���<���ʴ�=��üŸ��> -> ��ü���� ��Ƴ��� ��
 	�ֻ��� �÷��� : Collection<E> : Set<E>, List<E>,  Queue<E>, Map<K, V>
 	
 	Collection �ֿ�޼ҵ� 
 			- add(E e) : boolean -> �ش� �÷��ǿ� ��ü �߰�, �����ϸ� true ��ȯ
 			- addAll(Collection<? extends E> c) => Ư�� �÷��ǿ� �ִ� ��� ��ҵ��� �ٸ� �÷��ǿ� �߰�
 			- clear() => ��� ���(��ü)�� ����
 			- remove(Object o) => ������ ���� Ư�� ��ü�� ���� �÷��ǿ��� ����
 			- contains(Object o) => ���ڷ� ���� Ư�� ��ü�� ���� �÷��ǿ� �����ϸ� true
 			- isEmptry() => �ش� �÷����� ��� ������ true
			- size() => �ش� �÷��ǿ� �����ϴ� ��ü���� ��(�ݺ������� ���)
			- toArray() => �ش� �÷����� �迭�� ����.
			- iterator() => �ش� �÷��� �ȿ� �����ϴ� ��ü���� ������� �����ϱ� ���� Iterator(�ݺ���) ��ü�� ��ȯ
								�ϳ��� ������ ���ؼ� �ʿ�
	 */
}