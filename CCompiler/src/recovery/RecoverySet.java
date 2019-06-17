package recovery;

import CCompiler.Compilatudo;

import java. util.*;

public class RecoverySet extends HashSet {
    public RecoverySet() { // cria conjunto vazio
        super();
    }
    public RecoverySet(int t) { // cria conjunto com um tipo de token
        this.add(t);
    }
    public boolean contains (int t) { // verifica se token pertence ao conjunto
        return super.contains(t);
    }
    // faz a uniäo de dois conjuntos
    public RecoverySet union(RecoverySet s) {
        RecoverySet t = null;
        if (s != null) // se s retorna null
        t = (RecoverySet)this.clone();
        if (t != null) {
            t.addAll(s) ;
        }
        return t ;
    }

    // retorna um terceiro conjunto, sem destruir nenhum
    public RecoverySet remove(int n) {// retira um elemento do conjunto
        RecoverySet t = (RecoverySet) this.clone();
        t.remove(n);
        return t;
    }

    // retorna um novo conjunto, sem um dos elementos
    // cria string descrevendo os tokens que pertencem ao conjunto
    public String toString() {
        Iterator<Integer> it = this.iterator();

        StringBuilder s = new StringBuilder(" ");
        int k;
        while(it.hasNext()) {
            k = it.next();
            s.append(Compilatudo.im(k)).append(" ");
        }
        return s.toString();
    }

}
