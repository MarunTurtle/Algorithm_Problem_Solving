class Solution {
    public String solution(String code) {
        // Declare variables
        int mode = 0;
        StringBuilder ret = new StringBuilder();

        // Read String code 
        for (int idx = 0; idx < code.length(); idx++) {
            if (code.charAt(idx) == '1') {    
                // if mode == 0, 
                if (mode == 0) {
                    mode = 1;
                } else if (mode == 1) {
                    mode = 0;
                }
            } else {
                if (mode == 0) {
                    // if idx % 2 == 0
                    if (idx % 2 == 0) {
                        // ret.add(code[idx])
                        ret.append(code.charAt(idx));
                    }
                } else if (mode == 1) {
                    // if idx % 2 != 0 
                    if (idx % 2 != 0) {
                        // ret.add(code[idx])
                        ret.append(code.charAt(idx));
                    }
                }
            }
        }                       
        // if ret is empty
        if (ret.length() == 0) {
            // return EMPTY
            return "EMPTY";
        } else {
            // else return ret
            return ret.toString();
        }   
    }
}
