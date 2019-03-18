/*
 *----------------------------------------------------------------------------
 * $RCSfile: ApiXpdrInfo.java,v $
 *
 * $Revision: 1.1 $
 *
 * Description: holds the uplinkd, down link transponder and the APG
 *              frequency index for A3
 *
 * Copyright 1998 Hughes Electronics Corporation. All rights reserved.
 *----------------------------------------------------------------------------
 */

package read.file;

import java.util.StringTokenizer;

public final class ApiXpdrInfo {

	/*
	 * --------------------------------------------------------------------------
	 * -- Constants and Variables
	 * ------------------------------------------------
	 * ----------------------------
	 */

	private int netId;
	private int uplinkXpdr;
	private int downlinkXpdr;
	private int apgFreqIndex;

	public ApiXpdrInfo() {
	}

	public ApiXpdrInfo(int netId, int uplinkXpdr, int downlinkXpdr,
			int apgFreqIndex) {
		super();
		this.netId = netId;
		this.uplinkXpdr = uplinkXpdr;
		this.downlinkXpdr = downlinkXpdr;
		this.apgFreqIndex = apgFreqIndex;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + apgFreqIndex;
		result = prime * result + downlinkXpdr;
		result = prime * result + netId;
		result = prime * result + uplinkXpdr;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApiXpdrInfo other = (ApiXpdrInfo) obj;
		if (apgFreqIndex != other.apgFreqIndex)
			return false;
		if (downlinkXpdr != other.downlinkXpdr)
			return false;
		if (netId != other.netId)
			return false;
		if (uplinkXpdr != other.uplinkXpdr)
			return false;
		return true;
	}

//	this.netId = netId;
//	this.uplinkXpdr = uplinkXpdr;
//	this.downlinkXpdr = downlinkXpdr;
//	this.apgFreqIndex = apgFreqIndex;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("netId=").append(netId).append(", uplinkXpdr=").append(uplinkXpdr).append(", downlinkXpdr=")
				.append(downlinkXpdr).append(", apgFreqIndex=").append(apgFreqIndex);
		return builder.toString();

	}
	
	  /**
	   *--------------------------------------------------------------------------
	   * Get the column data for a DownLink to UpLink table.
	   *--------------------------------------------------------------------------
	   */
	  public Object getColumn(int col) {
	    switch (col) {
	      case 0:  return netId;
	      case 1:  return uplinkXpdr;
	      case 2:  return downlinkXpdr;
	      case 3:  return apgFreqIndex;
	      default: return null;
	    }
	  }

	  /**
	   *--------------------------------------------------------------------------
	   * Set the column data.
	   *--------------------------------------------------------------------------
	   */
	  public void toColFromString(int col, String newValue) {
	    switch (col) {
	    case 0:  netId = new Integer(newValue);
	             break;
	    case 1:  uplinkXpdr = new Integer(newValue);
	             break;
	    case 2:  downlinkXpdr = new Integer(newValue);
	             break;
	    case 3:  apgFreqIndex = new Integer(newValue);
	             break;
//	    case 4:  marketId     = new Integer(newValue);
//	             break;
	    default:;
	    }
	  }

	  /**
	   *--------------------------------------------------------------------------
	   * Handle the conversion from a String to ApiXpdrRateObject.
	   *--------------------------------------------------------------------------
	   */
	  public static ApiXpdrInfo convert(String newObject, String fieldDelim) {
	    int column = 0;
	    ApiXpdrInfo returnObject = new ApiXpdrInfo();
	    StringTokenizer tok = new StringTokenizer(newObject, fieldDelim);
	    while(tok.hasMoreElements()) {
	      returnObject.toColFromString(column, tok.nextToken());
	      column++;
	    }
	    return returnObject;
	  }

	public int getNetId() {
		return netId;
	}

	public void setNetId(int netId) {
		this.netId = netId;
	}

	public int getUplinkXpdr() {
		return uplinkXpdr;
	}

	public void setUplinkXpdr(int uplinkXpdr) {
		this.uplinkXpdr = uplinkXpdr;
	}

	public int getDownlinkXpdr() {
		return downlinkXpdr;
	}

	public void setDownlinkXpdr(int downlinkXpdr) {
		this.downlinkXpdr = downlinkXpdr;
	}

	public int getApgFreqIndex() {
		return apgFreqIndex;
	}

	public void setApgFreqIndex(int apgFreqIndex) {
		this.apgFreqIndex = apgFreqIndex;
	}

}
