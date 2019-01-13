public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.task1();
		System.out.println("\n-----------------------------\n");
		m.task2();
		System.out.println("\n-----------------------------\n");
		m.task3();
		System.out.println("\n-----------------------------\n");
		m.task4();
		System.out.println("\n-----------------------------\n");
		m.task5();
		System.out.println("\n-----------------------------\n");
		m.task6();
		System.out.println("\n-----------------------------\n");
		m.task7();
		System.out.println("\n-----------------------------\n");
	}


	private void task1() {
		for (int i = 10; i < 20; i++) {
			try {
				Thread.sleep(1000L);
				Thread t1 = new Thread(new PrintHelloTask());
				Thread t2 = new Thread(new PrintHelloTaskWithExtendsThread());
				t1.start();
				t2.start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void task2() {
		Thread t = new Thread(new PrintNumbersTask());
		t.start();
		printNumbersWithOtherThread(t);
	}

	private void task3() {
		Thread t = new Thread(new PrintNumbersTask());
		t.start();
		printNumbers();
	}

	private void task4() {
		Thread a = new Thread(new PrintInfinityMessageTask());
		a.start();
		try {
			Thread.sleep(35000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
		a.interrupt();
	}

	private void task5() {
		/**
		 * Szál interferencia
		 */
		Counter c = new Counter();
		Thread a = new Thread(new CounterIncrementTask(c));
		Thread b = new Thread(new CounterDecrementTask(c));
		a.start();
		b.start();
		try {
			a.join();
			b.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(c.getCounter());
	}

	private void task6() {
		/**
		 * Szinkornizált metódus kezelés, szálbiztos
		 */
		SyncronizedCounter c = new SyncronizedCounter();
		Thread a = new Thread(new SyncronizedIncrementTask(c));
		Thread b = new Thread(new SyncronizedDecrementTask(c));
		a.start();
		b.start();
		try {
			a.join();
			b.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(c.getCounter());
	}

	private void task7() {
		Hand hand = new Hand();
		Thread producerThread = new Thread(new Producer(hand));
		Thread consumerThread = new Thread(new Consumer(hand));
		producerThread.start();
		consumerThread.start();
	}

	private void printNumbersWithOtherThread(Thread t) {
		for (int i = 10; i < 20; i++) {
			try {
				Thread.sleep(1000L);
				// A join metódussal bevárom a másik Thread futásának végét.
				if (i == 15) {
					t.join();
				}
				System.out.println(i + 1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void printNumbers() {
		for (int i = 10; i < 20; i++) {
			try {
				Thread.sleep(1000L);
				System.out.println(i + 1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
