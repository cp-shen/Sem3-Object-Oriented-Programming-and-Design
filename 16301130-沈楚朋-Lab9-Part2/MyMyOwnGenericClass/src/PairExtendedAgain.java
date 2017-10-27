/**
 * @author BJTU16301130
 * @version 20171014
 */
public class PairExtendedAgain<F,S,T,F1> extends PairExtended<F,S,T>{
    F1 f1;

    PairExtendedAgain(F f, S s, T t, F1 f1){
        super(f,s,t);
        this.f1 = f1;
    }

    public F1 getF1(){
        return f1;
    }
}
