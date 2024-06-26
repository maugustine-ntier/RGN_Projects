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
package za.ntier.models;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for ZZ_Driver
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZ_Driver 
{

    /** TableName=ZZ_Driver */
    public static final String Table_Name = "ZZ_Driver";

    /** AD_Table_ID=1000007 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Tenant.
	  * Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within tenant
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within tenant
	  */
	public int getAD_Org_ID();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name Help */
    public static final String COLUMNNAME_Help = "Help";

	/** Set Comment/Help.
	  * Comment or Hint
	  */
	public void setHelp (String Help);

	/** Get Comment/Help.
	  * Comment or Hint
	  */
	public String getHelp();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name M_Shipper_ID */
    public static final String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";

	/** Set Shipper.
	  * Method or manner of product delivery
	  */
	public void setM_Shipper_ID (int M_Shipper_ID);

	/** Get Shipper.
	  * Method or manner of product delivery
	  */
	public int getM_Shipper_ID();

	public org.compiere.model.I_M_Shipper getM_Shipper() throws RuntimeException;

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name Value */
    public static final String COLUMNNAME_Value = "Value";

	/** Set Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value);

	/** Get Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public String getValue();

    /** Column name ZZ_Driver_ID */
    public static final String COLUMNNAME_ZZ_Driver_ID = "ZZ_Driver_ID";

	/** Set Driver.
	  * Driver table for Transporter window
	  */
	public void setZZ_Driver_ID (int ZZ_Driver_ID);

	/** Get Driver.
	  * Driver table for Transporter window
	  */
	public int getZZ_Driver_ID();

    /** Column name ZZ_Driver_UU */
    public static final String COLUMNNAME_ZZ_Driver_UU = "ZZ_Driver_UU";

	/** Set ZZ_Driver_UU	  */
	public void setZZ_Driver_UU (String ZZ_Driver_UU);

	/** Get ZZ_Driver_UU	  */
	public String getZZ_Driver_UU();

    /** Column name ZZ_ID_Passport_Attached */
    public static final String COLUMNNAME_ZZ_ID_Passport_Attached = "ZZ_ID_Passport_Attached";

	/** Set ID/Passport attached	  */
	public void setZZ_ID_Passport_Attached (boolean ZZ_ID_Passport_Attached);

	/** Get ID/Passport attached	  */
	public boolean isZZ_ID_Passport_Attached();

    /** Column name ZZ_ID_Passport_ID */
    public static final String COLUMNNAME_ZZ_ID_Passport_ID = "ZZ_ID_Passport_ID";

	/** Set ID / Passport	  */
	public void setZZ_ID_Passport_ID (int ZZ_ID_Passport_ID);

	/** Get ID / Passport	  */
	public int getZZ_ID_Passport_ID();

    /** Column name ZZ_ID_Passport_No */
    public static final String COLUMNNAME_ZZ_ID_Passport_No = "ZZ_ID_Passport_No";

	/** Set ID/Passport No	  */
	public void setZZ_ID_Passport_No (String ZZ_ID_Passport_No);

	/** Get ID/Passport No	  */
	public String getZZ_ID_Passport_No();

    /** Column name ZZ_Is_Valid */
    public static final String COLUMNNAME_ZZ_Is_Valid = "ZZ_Is_Valid";

	/** Set Valid Driver	  */
	public void setZZ_Is_Valid (boolean ZZ_Is_Valid);

	/** Get Valid Driver	  */
	public boolean isZZ_Is_Valid();

    /** Column name ZZ_License_Attached */
    public static final String COLUMNNAME_ZZ_License_Attached = "ZZ_License_Attached";

	/** Set License Attached	  */
	public void setZZ_License_Attached (boolean ZZ_License_Attached);

	/** Get License Attached	  */
	public boolean isZZ_License_Attached();

    /** Column name ZZ_License_Expiry_Date */
    public static final String COLUMNNAME_ZZ_License_Expiry_Date = "ZZ_License_Expiry_Date";

	/** Set License Expiry Date	  */
	public void setZZ_License_Expiry_Date (Timestamp ZZ_License_Expiry_Date);

	/** Get License Expiry Date	  */
	public Timestamp getZZ_License_Expiry_Date();

    /** Column name ZZ_License_ID */
    public static final String COLUMNNAME_ZZ_License_ID = "ZZ_License_ID";

	/** Set License	  */
	public void setZZ_License_ID (int ZZ_License_ID);

	/** Get License	  */
	public int getZZ_License_ID();

    /** Column name ZZ_Name_Surname */
    public static final String COLUMNNAME_ZZ_Name_Surname = "ZZ_Name_Surname";

	/** Set First Name And Surname	  */
	public void setZZ_Name_Surname (String ZZ_Name_Surname);

	/** Get First Name And Surname	  */
	public String getZZ_Name_Surname();

    /** Column name ZZ_Surname */
    public static final String COLUMNNAME_ZZ_Surname = "ZZ_Surname";

	/** Set Surname	  */
	public void setZZ_Surname (String ZZ_Surname);

	/** Get Surname	  */
	public String getZZ_Surname();
}
