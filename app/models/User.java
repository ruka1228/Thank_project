package models;

import javax.persistence.*;
import play.db.ebean.Model;
import views.html.users.*;

@Entity
public class User extends Model {
    @Id
    public Long id;

    public String name;

    public String password;

    public Integer permission;

    public static Finder<Long, User> find = new Finder<Long,User>(
        Long.class, User.class
    );

    /**
     * <code>
     * if (User.create("gongo", "pizza")) {
     *     System.out.println("認証成功!!");
     * } else {
     *     System.out.println("認証失敗...");
     * }
     * </code>
     *
     * @param username ユーザ名
     * @param password パスワード
     * @return ユーザ名 & パスワードのセットが正しければ true
     */
    public static Boolean authenticate(String name, String password) {
        User user = find.where().eq("name", name).findUnique();
        return (user != null && user.password.equals(password));
    }

//    public static Long create(Long id,String name, String password) {
//        User user = new User();
//        user.id = id;
//        user.name = name;
//        user.password = password;
//        user.permission = permission;
//        user.save();
//
//        return user.id;
//    }
}