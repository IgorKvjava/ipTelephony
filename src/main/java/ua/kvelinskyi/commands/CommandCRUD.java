package ua.kvelinskyi.commands;

import ua.kvelinskyi.Dao.impl.GenericDaoHibernateImpl;
import ua.kvelinskyi.entitys.PhoneBookEntity;
import ua.kvelinskyi.entitys.UsersEntity;

public class CommandCRUD {

    public void DeleteUser (UsersEntity usersEntity){
        GenericDaoHibernateImpl<UsersEntity,Integer> genericDaoHibernate = new GenericDaoHibernateImpl<>(UsersEntity.class);
        genericDaoHibernate.delete(usersEntity);
    }

    public void CreateUser (UsersEntity usersEntity){
        GenericDaoHibernateImpl<UsersEntity,Integer> genericDaoHibernate = new GenericDaoHibernateImpl<>(UsersEntity.class);
        genericDaoHibernate.create(usersEntity);
    }

    public void CreatePhoneBook(PhoneBookEntity phoneBookEntity){
        GenericDaoHibernateImpl<PhoneBookEntity,Integer> genericDaoHibernate = new GenericDaoHibernateImpl<>(PhoneBookEntity.class);
        genericDaoHibernate.create(phoneBookEntity);
    }




}
