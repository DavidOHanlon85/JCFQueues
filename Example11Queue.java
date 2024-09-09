package slideDeckChallenges;

import java.util.LinkedList;
import java.util.Queue;

public class Example11Queue {

	public static void main(String[] args) throws InterruptedException {
		
		int time = 10;
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for (int i =time; i >= 0; i--) {
			queue.add(i);
		}
		
		System.out.println("Queue items: " + queue);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.element());
			System.out.println(queue);
			Thread.sleep(1000);
		}
		
	}

}
