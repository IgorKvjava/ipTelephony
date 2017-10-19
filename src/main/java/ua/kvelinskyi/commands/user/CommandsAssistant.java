package ua.kvelinskyi.commands.user;

import ua.kvelinskyi.Dao.impl.GenericDaoHibernateImpl;
import ua.kvelinskyi.entitys.UsersEntity;

import java.util.List;

public class CommandsAssistant {

    public CommandsAssistant() {
    }

    public List listAllUsers (){
        GenericDaoHibernateImpl<UsersEntity,Integer>  genericDaoHibernate =
                new GenericDaoHibernateImpl<>(UsersEntity.class);
        List<UsersEntity> usersEntitiesList;
        usersEntitiesList = genericDaoHibernate.getAll();
        return usersEntitiesList;
    }

    public boolean isExist(UsersEntity user) {
        GenericDaoHibernateImpl<UsersEntity, String> genericDaoHibernate =
                new GenericDaoHibernateImpl<>(UsersEntity.class);
        if(genericDaoHibernate.read(user, user.getLogin()) != null){
            return true;
        }
        return false;
    }
}
