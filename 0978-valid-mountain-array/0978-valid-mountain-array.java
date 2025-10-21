class Solution {
        public boolean validMountainArray(int[] arr) {
                int peak = 0;
                        int peakIndx = 0;

                                if (arr.length < 3)
                                            return false;
                                                    for (int i = 0; i < arr.length; i++) {
                                                                if (peak < arr[i]) {
                                                                                peak = arr[i];
                                                                                                peakIndx = i;
                                                                                                            }
                                                                                                                    }
                                                                                                                            if (peakIndx == 0 || peakIndx == arr.length - 1)
                                                                                                                                        return false;

                                                                                                                                                for (int i = 0; i < peakIndx; i++) {
                                                                                                                                                            if (arr[i] >= arr[i + 1]) {
                                                                                                                                                                            return false;
                                                                                                                                                                                        }
                                                                                                                                                                                                }
                                                                                                                                                                                                        for (int i = peakIndx; i < arr.length - 1; i++) {
                                                                                                                                                                                                                    if (arr[i] <= arr[i + 1]) {
                                                                                                                                                                                                                                    return false;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                return true;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    }
