package uk.co.telegraph.engineering.exercise.repository;

import java.util.Optional;

public interface Repository<I, E> {

    /**
     * Creates the entity in the repository.
     *
     * @param entity the entity to be stored
     * @return the primary key of the entity
     */
    I create(E entity);

    /**
     * Reads an entity from the repository by its primary key.
     *
     * @param primaryKey the primary key of the entity
     * @return the found entity or absent
     */
    Optional<E> read(I primaryKey);

    /**
     * Updates the entity in the repository.
     *
     * @param entity the entity to be updated
     */
    void update(E entity);

    /**
     * Deletes the entity from the repository.
     *
     * @param entity the entity to be deleted
     */
    void delete(E entity);
}
