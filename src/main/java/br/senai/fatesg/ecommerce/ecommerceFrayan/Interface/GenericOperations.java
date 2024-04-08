package br.senai.fatesg.ecommerce.ecommerceFrayan.Interface;

import java.util.List;

/**
 * CRUD - http
 * create - post
 * read - get -> lista todos
 * read - get(id) -> listar um registro
 * update - put(id,objeto),patch(id,objeto)
 * delete - delete(id)
 *
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/generics/types.html">Documentação Generics</a>
 */
public interface GenericOperations<T, N> {

    public T create(T entity);

    public T read( N id);

    public List<T> readAll();

    //PATCH
    public T updatePart(N id, T entity);

    //PUT
    public T updateAll(N id, T entity);

    public void delete(N id);
}
