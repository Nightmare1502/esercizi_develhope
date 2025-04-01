/*
Scrivere una funzione che restituisca un hashset riempito
Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
Svuotare l'hashset, verificarlo e stampare il risultato
 */


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> animali = creaSet();
        String animale = "cavallo";

        Iterator<String> it = animali.iterator();

        while (it.hasNext()){
            String stringa = it.next();
            if (stringa.equals(animale)){
                it.remove();
            }
            System.out.println(stringa);
        }
        System.out.println(animali);

        animali.clear();
        System.out.println(animali);
    }

    public static Set<String> creaSet() {

        Set<String> animali = new HashSet<String>();

        animali.add("cavallo");
        animali.add("gallina");
        animali.add("pecora");

        return animali;
    }
}