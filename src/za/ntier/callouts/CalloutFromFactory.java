package za.ntier.callouts;

import java.util.Properties;

import org.adempiere.base.IColumnCallout;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MYear;
import org.compiere.util.DB;

import za.ntier.models.X_ZZ_Driver;
import za.ntier.models.X_ZZ_StockPile;
import za.ntier.models.X_ZZ_Transporters;
import za.ntier.models.X_ZZ_Truck;
import za.ntier.models.X_ZZ_Truck_List;

public class CalloutFromFactory implements IColumnCallout {

	@Override
	public String start(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value, Object oldValue) {
		System.out.println("Callout : " + mField.getColumnName() + " Value : " + value);
		if (mField.getColumnName().equals(X_ZZ_StockPile.COLUMNNAME_ZZ_Mined_Month) || mField.getColumnName().equals(X_ZZ_StockPile.COLUMNNAME_C_Year_ID)) {
			GridField mnt = mTab.getField(X_ZZ_StockPile.COLUMNNAME_ZZ_Mined_Month);
			GridField year = mTab.getField(X_ZZ_StockPile.COLUMNNAME_C_Year_ID);
			if (mnt.getValue() != null && year.getValue() != null) {
				MYear mYear = new MYear(ctx, (Integer)year.getValue(), null);
				String sql = "Select to_date('01" + mnt.getValue() + mYear.getFiscalYear() + "','ddmmyyyy')";
				//mTab.getField(X_ZZ_StockPile.COLUMNNAME_ZZ_Mined_Date).setValue(DB.getSQLValueTS(null, sql), false);		
				mTab.setValue(X_ZZ_StockPile.COLUMNNAME_ZZ_Mined_Date, DB.getSQLValueTS(null, sql));
			}
		}
		if (mField.getColumnName().equals(X_ZZ_Truck_List.COLUMNNAME_ZZ_Horse_ID)) {

		}

		if (mTab.getTableName().equals(X_ZZ_Driver.Table_Name) && (mField.getColumnName().equals(X_ZZ_Driver.COLUMNNAME_ZZ_ID_Passport_Attached) ||
				mField.getColumnName().equals(X_ZZ_Driver.COLUMNNAME_ZZ_License_Attached))) {
			if ((Boolean)mTab.getValue(X_ZZ_Driver.COLUMNNAME_ZZ_ID_Passport_Attached) && (Boolean)mTab.getValue(X_ZZ_Driver.COLUMNNAME_ZZ_License_Attached)) {
				mTab.setValue(X_ZZ_Driver.COLUMNNAME_ZZ_Is_Valid, "Y");
			} else {
				mTab.setValue(X_ZZ_Driver.COLUMNNAME_ZZ_Is_Valid, "N");
			}
		}
		
		if (mField.getColumnName().equals(X_ZZ_Transporters.COLUMNNAME_C_BPartner_ID)) {
			if (mField.getValue() != null) {
				MBPartner cust = MBPartner.get(ctx, (Integer)mField.getValue(), null);
				MBPartnerLocation[] locs = cust.getLocations(false);
				mTab.setValue(X_ZZ_Transporters.COLUMNNAME_C_BPartner_Location_ID, null);
				if (locs != null && locs.length > 0) {
					for (MBPartnerLocation loc : locs) {
						if (loc.isShipTo()) {
							mTab.setValue(X_ZZ_Transporters.COLUMNNAME_C_BPartner_Location_ID, loc.getC_BPartner_Location_ID());
							break;
						}
					}
				} 
			} else {
				mTab.setValue(X_ZZ_Transporters.COLUMNNAME_C_BPartner_Location_ID, null);
			}
		}
			
		if (mField.getColumnName().equals(X_ZZ_Truck_List.COLUMNNAME_ZZ_Horse_ID)) {
			if (mField.getValue() != null) {
				X_ZZ_Truck truck = new X_ZZ_Truck(ctx, (Integer)mField.getValue(), null);
				mTab.setValue(X_ZZ_Truck.COLUMNNAME_ZZ_Fleet_No, truck.getZZ_Fleet_No());
			} else {
				mTab.setValue(X_ZZ_Truck.COLUMNNAME_ZZ_Fleet_No, null);
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "CalloutFromFactory [toString()=" + super.toString() + "]";
	}

}
