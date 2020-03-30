package lab5.ex2;

public class Album implements Comparable<Album> {
    private String name;
    private Integer year;
    private Double rating;

    public Album(String name, Integer year, Double rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }


    @Override
    public int compareTo(Album album) {
        if (this.name.equals(album.name)) {
            return this.rating.compareTo(album.rating);
        } else {
            return this.name.compareTo(album.name);
        }
    }

    @Override
    public String toString() {
        return name + " " + year + " " + rating;
    }
}
