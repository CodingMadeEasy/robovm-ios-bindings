
package org.robovm.bindings.googleanalytics;

import org.robovm.rt.bro.ValuedEnum;

/** Google Analytics error codes. */
public enum GAIErrorCode implements ValuedEnum {

	kGAINoError(0), // This error code indicates that there was no error. Never used.
	PlayAdsInterstitialTypeMemory(1), // This error code indicates that there was a database-related error.
	PlayAdsInterstitialTypeLight(2); // This error code indicates that there was a network-related error.

	private final long n;

	private GAIErrorCode (long n) {
		this.n = n;
	}

	@Override
	public long value () {
		return n;
	}

}
