/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package za.ntier.models;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for ZZ_Cust_Dest
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZ_Cust_Dest")
public class X_ZZ_Cust_Dest extends PO implements I_ZZ_Cust_Dest, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20240610L;

    /** Standard Constructor */
    public X_ZZ_Cust_Dest (Properties ctx, int ZZ_Cust_Dest_ID, String trxName)
    {
      super (ctx, ZZ_Cust_Dest_ID, trxName);
      /** if (ZZ_Cust_Dest_ID == 0)
        {
			setName (null);
			setZZ_Cust_Dest_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_Cust_Dest (Properties ctx, int ZZ_Cust_Dest_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_Cust_Dest_ID, trxName, virtualColumns);
      /** if (ZZ_Cust_Dest_ID == 0)
        {
			setName (null);
			setZZ_Cust_Dest_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_Cust_Dest (Properties ctx, String ZZ_Cust_Dest_UU, String trxName)
    {
      super (ctx, ZZ_Cust_Dest_UU, trxName);
      /** if (ZZ_Cust_Dest_UU == null)
        {
			setName (null);
			setZZ_Cust_Dest_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_Cust_Dest (Properties ctx, String ZZ_Cust_Dest_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_Cust_Dest_UU, trxName, virtualColumns);
      /** if (ZZ_Cust_Dest_UU == null)
        {
			setName (null);
			setZZ_Cust_Dest_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZ_Cust_Dest (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuilder sb = new StringBuilder ("X_ZZ_Cust_Dest[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Description.
		@param Description Optional short description of the record
	*/
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription()
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Comment/Help.
		@param Help Comment or Hint
	*/
	public void setHelp (String Help)
	{
		set_Value (COLUMNNAME_Help, Help);
	}

	/** Get Comment/Help.
		@return Comment or Hint
	  */
	public String getHelp()
	{
		return (String)get_Value(COLUMNNAME_Help);
	}

	/** Set Import Truck List Via Excel.
		@param ImportTruckListViaExcel Import Truck List Via Excel
	*/
	public void setImportTruckListViaExcel (String ImportTruckListViaExcel)
	{
		set_Value (COLUMNNAME_ImportTruckListViaExcel, ImportTruckListViaExcel);
	}

	/** Get Import Truck List Via Excel.
		@return Import Truck List Via Excel	  */
	public String getImportTruckListViaExcel()
	{
		return (String)get_Value(COLUMNNAME_ImportTruckListViaExcel);
	}

	/** Set Name.
		@param Name Alphanumeric identifier of the entity
	*/
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName()
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

	/** Set Search Key.
		@param Value Search key for the record in the format required - must be unique
	*/
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue()
	{
		return (String)get_Value(COLUMNNAME_Value);
	}

	/** Set Customer Destinations.
		@param ZZ_Cust_Dest_ID Customer Destinations
	*/
	public void setZZ_Cust_Dest_ID (int ZZ_Cust_Dest_ID)
	{
		if (ZZ_Cust_Dest_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_Cust_Dest_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_Cust_Dest_ID, Integer.valueOf(ZZ_Cust_Dest_ID));
	}

	/** Get Customer Destinations.
		@return Customer Destinations	  */
	public int getZZ_Cust_Dest_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_Cust_Dest_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZ_Cust_Dest_UU.
		@param ZZ_Cust_Dest_UU ZZ_Cust_Dest_UU
	*/
	public void setZZ_Cust_Dest_UU (String ZZ_Cust_Dest_UU)
	{
		set_Value (COLUMNNAME_ZZ_Cust_Dest_UU, ZZ_Cust_Dest_UU);
	}

	/** Get ZZ_Cust_Dest_UU.
		@return ZZ_Cust_Dest_UU	  */
	public String getZZ_Cust_Dest_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Cust_Dest_UU);
	}
}