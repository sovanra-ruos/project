package istad.co.projectservice.feature.workspace;

import istad.co.projectservice.domain.Workspace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WorkspaceRepository extends JpaRepository<Workspace, Long> {

    Optional<Workspace> findByName(String name);

}
