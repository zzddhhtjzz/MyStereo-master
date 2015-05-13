package edu.neu.cs5200.mystereo.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-05-13T17:49:04.395-0400")
@StaticMetamodel(Music.class)
public class Music_ {
	public static volatile SingularAttribute<Music, Integer> msid;
	public static volatile SingularAttribute<Music, String> name;
	public static volatile SingularAttribute<Music, String> mbid;
	public static volatile SingularAttribute<Music, String> url;
	public static volatile SingularAttribute<Music, String> tag;
	public static volatile SingularAttribute<Music, Album> album;
	public static volatile SingularAttribute<Music, String> summary;
	public static volatile ListAttribute<Music, PlayList2Music> playlistEntities;
	public static volatile ListAttribute<Music, Comment> comments;
}
