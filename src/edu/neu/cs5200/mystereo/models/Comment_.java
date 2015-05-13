package edu.neu.cs5200.mystereo.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-05-13T17:49:04.361-0400")
@StaticMetamodel(Comment.class)
public class Comment_ {
	public static volatile SingularAttribute<Comment, Integer> id;
	public static volatile SingularAttribute<Comment, String> title;
	public static volatile SingularAttribute<Comment, String> content;
	public static volatile SingularAttribute<Comment, User> user;
	public static volatile SingularAttribute<Comment, Music> music;
}
