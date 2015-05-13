package edu.neu.cs5200.mystereo.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-05-13T17:49:04.359-0400")
@StaticMetamodel(Artist.class)
public class Artist_ {
	public static volatile SingularAttribute<Artist, Integer> artistId;
	public static volatile SingularAttribute<Artist, String> name;
	public static volatile SingularAttribute<Artist, String> mbid;
	public static volatile SingularAttribute<Artist, String> url;
	public static volatile SingularAttribute<Artist, String> image;
	public static volatile SingularAttribute<Artist, String> summary;
	public static volatile ListAttribute<Artist, Album> albums;
}
