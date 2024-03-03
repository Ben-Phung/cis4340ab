public static int multAccum(int oldAcc, int newVal, int scale) {
  return safeAdd(oldAcc, safeMultiply(newVal, scale));
}
