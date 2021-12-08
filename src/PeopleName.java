public class PeopleName implements Comparable<PeopleName> {
    private String fName;
    private String lName;
    private String fullName;
    public PeopleName (String fullnames) {
        this.fullName = fullnames;
        this.splitNames(this.fullName);
    }

    private void splitNames(String fullName) {
        if (fullName.length() < 1 || !fullName.contains(",")) {
            return;
        }
        // Default split limit of 2
        String[] names = fullName.split(",", 2);
        this.lName = names[0];
        this.fName = names[1];
    }

    public String getFName() {
        return this.fName;
    }

    public String getLName() {
        return this.lName;
    }

    @Override
    public int compareTo(PeopleName name) {
        int res = 0;
        if (this.lName.compareTo(name.getLName()) < 0) {
            // If the last current name is less
            res = -1;
        } else if (this.lName.compareTo(name.getLName()) > 0) {
            // If the first current name is greater
            res = 1;
        } else {
            if (this.lName.compareTo(name.getLName()) == 0 && this.fName.compareTo(name.getFName()) == 0) {
                // If the last current and first current is equal
                res = 0;
            } else {
                if (this.lName.compareTo(name.getLName()) == 0) {
                    if (this.fName.compareTo(name.getFName()) < 0) {
                        res = -1;
                    } else {
                        res = 1;
                    }
                }
            }
        }
        return res;
    }

    @Override
    public String toString() {
        return this.lName + "," + this.fName;
    }
}
