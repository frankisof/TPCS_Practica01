package org.uv.tpcs_practica_01;
import java.util.List;
import java.sql.Connection;

public abstract class SelectionDB<T> {
    protected T p;
    public SelectionDB(T p){
    this.p =p;
    }
    public abstract List<T> select (Connection con);
}
