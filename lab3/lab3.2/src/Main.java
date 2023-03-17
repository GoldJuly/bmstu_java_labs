import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите размерность массива n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        QEquation[] qeqs = new QEquation[n];
        Set<String> solves = new HashSet<>();
        for (int i=0; i<n; i++){
            qeqs[i] = new QEquation();
            Set<String> qsolve = qeqs[i].solve();
            Iterator iterator = qsolve.iterator();
            while (iterator.hasNext()){
                solves.add((String) iterator.next());
            }
        }
        String[] array = solves.toArray(new String[0]);
        System.out.print("Полученные корни: ");
        System.out.println(Arrays.toString(array));
        double[] doubles = new double[array.length];
        for (int i=0; i< array.length; i++) {
            doubles[i] = Double.parseDouble(array[i]);
        }
        double min = doubles[0];
        double max = doubles[0];
        for (int i=1; i<doubles.length; i++){
            if (doubles[i]>max){max = doubles[i];}
            if (doubles[i]<min){min = doubles[i];}
        }
        System.out.println("Наименьший корень: "+ min);
        System.out.println("Наибольший корень: "+ max);
    }
}