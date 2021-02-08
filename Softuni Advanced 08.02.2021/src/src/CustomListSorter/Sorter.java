package CustomListSorter;

public class Sorter<T extends Comparable<T>>{

    public static void sort(CustomListSorter customListSorter){
        for (int i = 0; i < customListSorter.list.size(); i++) {
            String element = (String) customListSorter.get(i);
            for (int j = i + 1; j < customListSorter.list.size(); j++) {
                String nextElement = (String) customListSorter.get(j);
                if (element.compareTo(nextElement) > 0) {
                    customListSorter.swap(i, j);
                }
            }
        }
    }
}
