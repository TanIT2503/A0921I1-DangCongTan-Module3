package model.service.impl;

import model.bean.User;
import model.repository.IUserDAO;
import model.repository.impl.UserDAO;
import model.service.IUserService;


import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements IUserService {
    IUserDAO userDAO=new UserDAO();
    @Override
    public void insertUser(User user) throws SQLException {
        userDAO.insertUser(user);
    }

    @Override
    public User selectUser(int id) {
        return userDAO.selectUser(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return userDAO.selectAllUsers();
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return userDAO.deleteUser(id);
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return userDAO.updateUser(user);
    }

    @Override
    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }

    @Override
    public void addUserTransaction(User user, int[] permision) {
        userDAO.addUserTransaction(user, permision);
    }
}