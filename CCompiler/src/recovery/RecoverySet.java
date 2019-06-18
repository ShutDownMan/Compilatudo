package recovery;

import java.util.HashSet;
import java.util.Iterator;

import CCompiler.Compilatudo;

public class RecoverySet extends HashSet {

    public RecoverySet() { //cria conjunto vazio
        super();
    }
    public RecoverySet(int t) { //cria conjunto com um tipo de token
        this.add(new Integer(t));
    }

    public boolean contains (int t) { //verifica se token pertence ao conjunto
        return super.contains(new Integer(t));
    }

    //faz a uni�o de dois conjuntos
    public RecoverySet union (RecoverySet s) {
        RecoverySet t = null;
        if(s != null) {
            t = (RecoverySet) this.clone();
            t.addAll(s);
        }
        return t; // retorna um tercceiro conjunto sem excluir nenhum
    }

    public RecoverySet remove (int n) { //remove um elemento do conjunto
        RecoverySet t = (RecoverySet)this.clone();
        t.remove(new Integer(n));
        return t;
    }

    public String toString() {
        Iterator it = this.iterator();
        StringBuilder s = new StringBuilder();
        int k;
        while(it.hasNext()) {
            k = ((Integer) it.next()).intValue();
            s.append(Compilatudo.im(k)).append(" ");
        }
        return s.toString();
    }
}
