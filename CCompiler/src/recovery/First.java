package recovery;

import CCompiler.Compilatudo;
import CCompiler.CompilatudoConstants;

//implementa os conjuntos first para alguns n�o-terminais
public class First {
    static public final RecoverySet varlist = new RecoverySet();
    static public final RecoverySet functlist = new RecoverySet();
    static public final RecoverySet functbody = new RecoverySet();
    static public final RecoverySet program = new RecoverySet();

    static {
        varlist.add(new Integer(CompilatudoConstants.VOID));
        varlist.add(new Integer(CompilatudoConstants.INT));
        varlist.add(new Integer(CompilatudoConstants.CHAR));

        functlist.add(new Integer(CompilatudoConstants.VOID));
        functlist.add(new Integer(CompilatudoConstants.INT));
        functlist.add(new Integer(CompilatudoConstants.CHAR));
//        functlist.add(new Integer(CompilatudoConstants.ID));

        functbody.addAll(varlist);
        functbody.add(new Integer(CompilatudoConstants.IF));
//        functbody.add(new Integer(CompilatudoConstants.SWITCH));
        functbody.add(new Integer(CompilatudoConstants.FOR));
        functbody.add(new Integer(CompilatudoConstants.WHILE));
        functbody.add(new Integer(CompilatudoConstants.ID));
//        functbody.add(new Integer(CompilatudoConstants.BREAK));
        functbody.add(new Integer(CompilatudoConstants.RETURN));

        program.add(new Integer(Compilatudo.HASHTAG));
        program.union(program);
    }

}
