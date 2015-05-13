package edu.neu.cs5200.mystereo.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-05-13T17:49:04.416-0400")
@StaticMetamodel(User.class)
public class User_ {
	public static volatile SingularAttribute<User, Integer> uId;
	public static volatile SingularAttribute<User, String> username;
	public static volatile SingularAttribute<User, String> password;
	public static volatile SingularAttribute<User, String> sex;
	public static volatile SingularAttribute<User, String> description;
	public static volatile ListAttribute<User, PlayList> playlists;
	public static volatile ListAttribute<User, Follow> follows;
	public static volatile ListAttribute<User, Follow> followeds;
	public static volatile ListAttribute<User, Comment> comments;
	public static volatile SingularAttribute<User, String> type;
}
