/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.uv.tpcs_practica_01;

import java.util.List;

/**
 *
 * @author francisco
 */
public interface IDAO <T,I>{
    public T save(T pojo);
    public T update(T pojo, I id);
    public T delete(int id, T pojo);
    public List<T> findall();
    public List<T> findbyId(int id);
}
