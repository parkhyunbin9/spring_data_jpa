package study.datajpa.repository;

public interface NestedClosedProjection {
    String getUsername();
    Teaminfo getTeam();

    interface Teaminfo {
        String getName();
    }

}
