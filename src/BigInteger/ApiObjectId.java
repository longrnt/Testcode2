/*
 *----------------------------------------------------------------------------
 * $RCSfile: ApiObjectId.java,v $
 *
 * $Revision: 1.14 $
 *
 * Description: The ApiObjectId for each database object. 
 *
 * Copyright 1998 Hughes Electronics Corporation. All rights reserved.
 *----------------------------------------------------------------------------
 */

package BigInteger;

/*
 *----------------------------------------------------------------------------
 * Imported libraries:
 *----------------------------------------------------------------------------
 */

import java.util.*;
import java.io.*;
import java.awt.*;

public class ApiObjectId {

/*
 *----------------------------------------------------------------------------
 * Constants and Variables
 *----------------------------------------------------------------------------
 */
  // Version Control Stuff
  private static final String identString = "ident $Id: ApiObjectId.java,v 1.14 2000/09/06 01:22:21 chen Exp $";

  // Copyright Stuff
  private static final String copyrightString = "$Copyright 1998 Hughes Electronics Corporation.  All rights reserved.$";

  public int objectType;
  public int objectVersion;
  public long dbObjectId;

/*
 *----------------------------------------------------------------------------
 * Constructor(s)
 *----------------------------------------------------------------------------
 */
  public ApiObjectId() {
    objectType = 0;
    objectVersion = 0;
    dbObjectId = 0;
  }

  public ApiObjectId(int oType) {
    objectType    = oType;
  }

  public ApiObjectId(int oType, long dbId) {
    objectType    = oType;
    dbObjectId = dbId;
  }

  public ApiObjectId(int oType, int oVersion, long dbId) {
    objectType    = oType;
    objectVersion = oVersion;
    dbObjectId    = dbId;
  }

/*
 *----------------------------------------------------------------------------
 * IMPLEMENTATION OF PRIVATE METHODS:
 *----------------------------------------------------------------------------
 */

/*
 *----------------------------------------------------------------------------
 * IMPLEMENTATION OF PROTECTED METHODS:
 *----------------------------------------------------------------------------
 */

/*
 *----------------------------------------------------------------------------
 * IMPLEMENTATION OF PUBLIC METHODS:
 *----------------------------------------------------------------------------
 */

  /**
   *--------------------------------------------------------------------------
   * Get the objectType. 
   *--------------------------------------------------------------------------
   */
  public int getType()
  {
    return objectType;
  }

  /**
   *--------------------------------------------------------------------------
   * Get the objectVersion.
   *--------------------------------------------------------------------------
   */
  public int getVersion()
  {
    return objectVersion;
  }

  /**
   *--------------------------------------------------------------------------
   * Get the dbObjectId.
   *--------------------------------------------------------------------------
   */
  public long getId()
  {
    return dbObjectId;
  }

  /**
   *--------------------------------------------------------------------------
   * Compare if the current object and the compare object are equal.
   *
   * Return true if objects are equal.
   * Return false if objects are not equal.
   *--------------------------------------------------------------------------
   */
  public boolean equals(ApiObjectId compareObject) {
    return((objectType == compareObject.objectType) &&
           (objectVersion == compareObject.objectVersion) &&
           (dbObjectId == compareObject.dbObjectId));
  }

  /**
   *--------------------------------------------------------------------------
   * Compare if the current object and the compare object are equal.
   *
   * Return true if objects are equal.
   * Return false if objects are not equal.
   *--------------------------------------------------------------------------
   */
  public boolean wrongVersion(ApiObjectId compareObject) {
    return((objectType == compareObject.objectType) &&
           (objectVersion != compareObject.objectVersion) &&
           (dbObjectId == compareObject.dbObjectId));
  }

  /**
   *--------------------------------------------------------------------------
   * Make a copy of the current object.
   * Returns the copied object.
   *--------------------------------------------------------------------------
   */
  public ApiObjectId cloneMe() {
    return(new ApiObjectId(getType(), getVersion(), getId()));
  }

  /**
   *--------------------------------------------------------------------------
   * Handle the conversion from a ApiObjectId to String.
   *--------------------------------------------------------------------------
   */
  public String toString() {
	  return "ApiObjectId";
  }

}
