package za.ntier.models;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.util.DB;

public class MTruck extends X_ZZ_Truck {

	public MTruck(Properties ctx, int ZZ_Truck_ID, String trxName) {
		super(ctx, ZZ_Truck_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MTruck(Properties ctx, int ZZ_Truck_ID, String trxName, String... virtualColumns) {
		super(ctx, ZZ_Truck_ID, trxName, virtualColumns);
		// TODO Auto-generated constructor stub
	}

	public MTruck(Properties ctx, String ZZ_Truck_UU, String trxName) {
		super(ctx, ZZ_Truck_UU, trxName);
		// TODO Auto-generated constructor stub
	}

	public MTruck(Properties ctx, String ZZ_Truck_UU, String trxName, String... virtualColumns) {
		super(ctx, ZZ_Truck_UU, trxName, virtualColumns);
		// TODO Auto-generated constructor stub
	}

	public MTruck(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}
	
	public static MTruck getTruck(Properties ctx,String ZZ_Registration_No) {
		MTruck mTruck = null;
		String SQL = "select t.ZZ_Truck_ID from ZZ_Truck t where t.ZZ_Registration_No = ?";
		int zz_Truck_ID = DB.getSQLValue(null, SQL, ZZ_Registration_No.trim());
		if (zz_Truck_ID > 0) {
			mTruck = new MTruck(ctx, zz_Truck_ID, null);
		}
		return mTruck;
	}

}
