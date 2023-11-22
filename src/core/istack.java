package core;

public interface istack {
	boolean isEmpty();
	int getSize();
	void push(Integer item);
	Integer pop();
	Integer peek();
}