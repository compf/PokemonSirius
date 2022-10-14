package compf.core.etc;

import java.util.Random;

public class MyObject {
	public static final Random RNG = new Random();

	public static void nop() {
		// TODO Auto-generated method stub

	}

	public static <T> void swap(T[] arr, int index1, int index2) {
		var dummy = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = dummy;
	}

	public static void safeSleep(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static int getPerc() {
		return MyObject.RNG.nextInt(101);
	}

	public static boolean checkPerc(int upTo) {
		return getPerc() <= upTo;
	}

	public static int randomNumber(int fromInc, int toExc) {
		return RNG.nextInt(toExc - fromInc) + fromInc;
	}

	public static byte[] getIndices(short index) {
		byte b1 = (byte) (index >> 8);
		byte b2 = (byte) (index & 0xFF);
		return new byte[] { b1, b2 };
	}

	public static int combine(short playerIndex, short pokeIndex) {
		return (int) ((playerIndex << 16) | pokeIndex);
	}

	public static short[] getIndices(int index) {
		var b1 = (short) (index >> 16);
		var b2 = (short) (index & 0xFFFF);
		return new short[] { b1, b2 };
	}

	public short combine(byte playerIndex, byte pokeIndex) {
		return (short) ((playerIndex << 16) | pokeIndex);
	}

	public static int[] getIndices(long index) {
		var b1 = (int) (index >> 32);
		var b2 = (int) (index);
		return new int[] { b1, b2 };
	}

	public long combine(int playerIndex, int pokeIndex) {
		return (long) ((playerIndex << 32) | pokeIndex);
	}

	public static <T> int indexOf(T[] arr, T val) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				return i;
			}
		}
		return -1;
	}

}
