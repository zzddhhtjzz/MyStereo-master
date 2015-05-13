package edu.neu.cs5200.mystereo.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-05-13T17:49:04.393-0400")
@StaticMetamodel(Follow.class)
public class Follow_ {
	public static volatile SingularAttribute<Follow, Integer> fid;
	public static volatile SingularAttribute<Follow, User> follow;
	public static volatile SingularAttribute<Follow, User> followed;
}
