package ua.kvelinskyi.Dao.interfaces;

import ua.kvelinskyi.entitys.UsersEntity;

import java.io.Serializable;
import java.util.List;

public interface GenericDao <T, PK extends Serializable> {

    /**
     * Сохранить объект newInstance в базе данных
     */
    public PK create(T newInstance);

    /**
     * Извлечь объект, предварительно сохраненный в базе данных, используя
     *   указанный id в качестве первичного ключа
     */
    public T read(PK id);

    /** Сохранить изменения, сделанные в объекте.  */
    public void update(T transientObject);

    /** Удалить объект из базы данных */
    public void delete(T persistentObject);

    public boolean isExist(UsersEntity usersEntity);

    public  boolean isAdmin(UsersEntity usersEntity);

    public List<T> getAll();
}