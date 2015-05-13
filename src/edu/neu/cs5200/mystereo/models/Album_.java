package edu.neu.cs5200.mystereo.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-05-13T17:49:04.157-0400")
@StaticMetamodel(Album.class)
public class Album_ {
	public static volatile SingularAttribute<Album, Integer> albumId;
	public static volatile SingularAttribute<Album, String> name;
	public static volatile SingularAttribute<Album, String> mbid;
	public static volatile SingularAttribute<Album, String> url;
	public static volatile SingularAttribute<Album, String> releaseDate;
	public static volatile SingularAttribute<Album, String> image;
	public static volatile SingularAttribute<Album, String> summary;
	public static volatile SingularAttribute<Album, Artist> artist;
	public static volatile ListAttribute<Album, Music> music;
}
