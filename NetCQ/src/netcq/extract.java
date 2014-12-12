/*
 * extract.java
 * Getcommon values of two lists  
 * Version 1.4
 * 12/12/2014
 */

package netcq;

import java.util.*;

public class extract {

    // compare two lists and return the common item list;
    public static List<Integer> getcommon(List<Integer> lista, List<Integer> listb) {
        List<Integer> retlist1 = new ArrayList<Integer>();
        List<Integer> retlist2 = new ArrayList<Integer>();
        if (lista != null && listb != null) {
            for (int n = 0; n < lista.size(); n++) {
                if (listb.contains(lista.get(n))) {
                    retlist1.add(lista.get(n));
                }
            }
            Iterator<Integer> itr1 = retlist1.listIterator();
            while (itr1.hasNext()) {
                Integer itn1 = (Integer) itr1.next();
                if (retlist2.contains(itn1) == false) {
                    retlist2.add(itn1);
                }
            }
        } else if (lista != null || listb != null) {
            if (lista != null) {
                retlist2 = lista;
            }
            if (listb != null) {
                retlist2 = listb;

            }
        }
        return retlist2;
    }

}
