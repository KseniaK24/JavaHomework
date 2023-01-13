import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    Map<Integer, laptop> laptopsAll = new HashMap<>();
    public static void main(String[] args) {
        Main m = new Main();
        laptop lp1 = new laptop("huawei", "rlef-x", 16, 512, "windows");
        laptop lp2 = new laptop("honor", "hym-w56", 16, 512, "windows");
        laptop lp3 = new laptop("apple", "mgn63", 8, 256, "macOS");
        laptop lp4 = new laptop("trunderobot", "911 plus pro", 16, 512, "windows");
        laptop lp5 = new laptop("lenovo", "15itl05", 8, 256, "windows");
        laptop lp6 = new laptop("apple", "mgn62", 8, 256, "macOS");
        m.addLaptop(lp1);
        m.addLaptop(lp2);
        m.addLaptop(lp3);
        m.addLaptop(lp4);
        m.addLaptop(lp5);
        m.addLaptop(lp6);
        m.print((HashMap<Integer, laptop>) m.laptopsAll);
        m.print((HashMap<Integer, laptop>) m.filter((HashMap<Integer, laptop>) m.laptopsAll));


    }
    public void addLaptop(laptop lp){
        int id = laptopsAll.keySet().size() + 1;
        laptopsAll.put(id,lp);
    }

    public void print (HashMap<Integer, laptop> lp){
        if (lp.size() == 0){
            System.out.println("laptops not found");
        }
        for (int i: lp.keySet()){
            System.out.println(lp.get(i));
        }
    }
    public Map<Integer, laptop> filter (HashMap<Integer, laptop> lpAll){
        Map<Integer,String> criteria = new HashMap<>();
        criteria.put(1, "firm");
        criteria.put(2, "model");
        criteria.put(3, "ram");
        criteria.put(4, "hard dick");
        criteria.put(5, "operating system");
        System.out.println("\nSelect a filter criterion:");
        System.out.println(criteria);
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("Enter the criterion value: ");
        String value = scan.next();
        Map<Integer,laptop> filterLaptops = new HashMap<>();
        if (criteria.get(num).equals("firm")){
            for (int i: lpAll.keySet()){
                if (lpAll.get(i).firm.equals(value)){
                    filterLaptops.put(filterLaptops.keySet().size() + 1, lpAll.get(i));
                }
            }
        }
        if (criteria.get(num).equals("model")){
            for (int i: lpAll.keySet()){
                if (lpAll.get(i).model.equals(value)){
                    filterLaptops.put(filterLaptops.keySet().size() + 1, lpAll.get(i));
                }
            }
        }
        if (criteria.get(num).equals("ram")){
            for (int i: lpAll.keySet()){
                int v = Integer.valueOf(value);
                if (lpAll.get(i).ram >= v){
                    filterLaptops.put(filterLaptops.keySet().size() + 1, lpAll.get(i));
                }
            }
        }
        if (criteria.get(num).equals("hard dick")){
            for (int i: lpAll.keySet()){
                int v = Integer.valueOf(value);
                if (lpAll.get(i).hardDisk >= v){
                    filterLaptops.put(filterLaptops.keySet().size() + 1, lpAll.get(i));
                }
            }
        }
        if (criteria.get(num).equals("operating system")){
            for (int i: lpAll.keySet()){
                if (lpAll.get(i).operatingSystem.equals(value)){
                    filterLaptops.put(filterLaptops.keySet().size() + 1, lpAll.get(i));
                }
            }
        }
        return filterLaptops;





    }
}