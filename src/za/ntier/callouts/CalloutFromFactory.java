package za.ntier.callouts;

import java.util.Properties;

import org.adempiere.base.IColumnCallout;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MYear;
import org.compiere.util.DB;

import za.ntier.models.X_ZZ_StockPile;

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
			   mTab.getField(X_ZZ_StockPile.COLUMNNAME_ZZ_Mined_Date).setValue(DB.getSQLValueTS(null, sql), false);			   
		   }
		}
		return null;
	}

	@Override
	public String toString() {
		return "CalloutFromFactory [toString()=" + super.toString() + "]";
	}

}
