package edu.neu.cs5200.mystereo.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-05-13T17:49:04.397-0400")
@StaticMetamodel(PlayList.class)
public class PlayList_ {
	public static volatile SingularAttribute<PlayList, Integer> pId;
	public static volatile SingularAttribute<PlayList, String> title;
	public static volatile SingularAttribute<PlayList, User> user;
	public static volatile ListAttribute<PlayList, PlayList2Music> playListEntries;
}
