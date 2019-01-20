import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {

	private final int NUMBER = 1_000_000_000;

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Main m = new Main();
		m.task1();
		m.task2();
		m.task3();
		m.task4();
	}

	private void task1() throws InterruptedException {
		/*
		 * A Runnable interfészt implementáló feladat osztály írja ki a paraméterként
		 * kapott pozitív egész szám osztóit!
		 */
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.execute(new PrintDivisorsTask(1000));
		executor.shutdown();
		executor.awaitTermination(2L, TimeUnit.HOURS);
		System.out.println("Viszlát.");
	}

	private void task2() throws InterruptedException, ExecutionException {
		/*
		 * A Callable interfészt implementáló CalculateDivisorsTask nevű feladat osztály
		 * adja vissza a paraméterként kapott pozitív egész szám osztóinak halmazát!
		 */
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future<Set<Integer>> result = executorService.submit(new CalculateDivisorsTask(1000));
		System.out.println(result.get());
		executorService.awaitTermination(2L, TimeUnit.HOURS);
		executorService.shutdown();
		System.out.println("Viszlát.");
	}

	private void task3() throws InterruptedException, ExecutionException {
		/*
		 * Írj Java programot, ami fixen 5 méretű Thread poolt használ ahhoz, hogy
		 * lefuttassa a következő feladatot:
		 * 
		 * A Callable interfészt implementáló CalculateDivisorsTask nevű feladat osztály
		 * adja vissza a paraméterként kapott pozitív egész szám osztóinak halmazát!
		 * 
		 * A visszaadott eredményt a fő szálban írasd ki a standard kimenetre!
		 * 
		 * 10 számnak számíttassuk ki az osztóit, vagyis a CalculateDivisorsTask-ból 10
		 * példányt hozzunk létre 10 különböző számhoz!
		 * 
		 * A kiíratás úgy történjen, hogy a szám osztói vessző szóközzel elválasztva
		 * egymástól növekvő sorrendben!
		 */
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		List<Integer> numbersOfList = new ArrayList<>();
		Map<Integer, Future<Set<Integer>>> futureMap = new TreeMap<>();
		for (int i = 0; i < 10; i++) {
			int number = new Random().nextInt(NUMBER) + 1;
			numbersOfList.add(number);
			futureMap.put(number, executorService.submit(new CalculateDivisorsTask(number)));
		}
		for (Integer integer : numbersOfList) {
			Future<Set<Integer>> temp = futureMap.get(integer);
			System.out.println(integer + ": " + temp.get());
		}
		executorService.shutdown();
		executorService.awaitTermination(2L, TimeUnit.HOURS);
		System.out.println("Viszlát.");
	}

	private void task4() throws InterruptedException, ExecutionException {
		/*
		 * Írj Java programot, ami fixen 5 méretű Thread poolt használ ahhoz, hogy
		 * lefuttassa a következő feladatot:
		 * 
		 * A Callable interfészt implementáló CalculateDivisorsTask nevű feladat osztály
		 * adja vissza a paraméterként kapott pozitív egész szám osztóinak halmazát!
		 * 
		 * A visszaadott eredményt a fő szálban írasd ki a standard kimenetre!
		 * 
		 * 10 számnak számíttassuk ki az osztóit, vagyis a CalculateDivisorsTask-ból 10
		 * példányt hozzunk létre 10 különböző számhoz!
		 * 
		 * A kiíratás a main szálon úgy történjen, hogy másodpercenként egyszer nézzük
		 * meg, hogy melyik feladat futása fejeződött már be. Amelyik befejeződött, azt
		 * írjuk ki és vegyük ki a listából!
		 * 
		 * Ha mindegyik feladat befejeződött, akkor álljon le a main szál is!
		 */
		ExecutorService executorService = Executors.newScheduledThreadPool(5);
		List<Integer> numbersOfList = new ArrayList<>();
		Map<Integer, Future<Set<Integer>>> futureMap = new TreeMap<>();
		for (int i = 0; i < 10; i++) {
			int number = new Random().nextInt(NUMBER) + 1;
			numbersOfList.add(number);
			futureMap.put(number, executorService.submit(new CalculateDivisorsTask(number)));
		}
		while (!futureMap.isEmpty()) {
			for (Iterator<Entry<Integer, Future<Set<Integer>>>> iterator = futureMap.entrySet().iterator(); iterator
					.hasNext();) {
				Entry<Integer, Future<Set<Integer>>> next = iterator.next();
				if (next.getValue().isDone()) {
					System.out.println(next.getKey() + ": " + next.getValue().get());
					iterator.remove();
				}
			}
		}
		executorService.shutdown();
		executorService.awaitTermination(2L, TimeUnit.HOURS);
		System.out.println("Viszlát.");
	}
}
