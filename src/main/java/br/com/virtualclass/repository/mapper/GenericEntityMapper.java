package br.com.virtualclass.repository.mapper;

/**
 * @author João Arthur (joaoarthur.ufrn@gmail.com)
 * @since 06/07/2021
 */
public interface GenericEntityMapper<M, E> {

    M toModel(E entity);

    E fromModel(M model);
}