
package org.uv.tpcs_practica_01;

import java.sql.Connection;

public abstract class TransactionDB<T> {
    protected T p;
    public TransactionDB(T p){
    this.p=p;
    }
    
    public abstract boolean execute(Connection con);

    
    
    
    
}
