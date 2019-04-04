package day13;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Test03_01 extends Calendar {

	public Test03_01() {
	}

	public Test03_01(TimeZone zone, Locale aLocale) {
		super(zone, aLocale);

	}

	@Override
	protected void computeTime() {
	}

	@Override
	protected void computeFields() {
	}

	@Override
	public void add(int field, int amount) {
	}

	@Override
	public void roll(int field, boolean up) {
	}

	@Override
	public int getMinimum(int field) {
		return 0;
	}

	@Override
	public int getMaximum(int field) {
		return 0;
	}

	@Override
	public int getGreatestMinimum(int field) {
		return 0;
	}

	@Override
	public int getLeastMaximum(int field) {
		return 0;
	}

}
