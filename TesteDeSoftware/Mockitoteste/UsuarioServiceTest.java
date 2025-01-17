package TesteDeSoftware.Mockitoteste;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
class UsuarioServiceTest {
    private UsuarioRepository usuarioRepository;
    private UsuarioService usuarioService;
    @BeforeEach
    void setUp() {
        usuarioRepository = Mockito.mock(UsuarioRepository.class);
        usuarioService = new UsuarioService(usuarioRepository);
    }
    @Test
    void testBuscarUsuarioPorId_Sucesso() {
        // Arrange
        Usuario usuarioMock = new Usuario(1L, "João");
        when(usuarioRepository.findById(1L)).thenReturn(Optional.of(usuarioMock));
        // Act
        Usuario usuario = usuarioService.buscarUsuarioPorId(1L);
        // Assert
        assertNotNull(usuario);
        assertEquals("João", usuario.getNome());
        verify(usuarioRepository, times(1)).findById(1L);
    }
    @Test
    void testBuscarUsuarioPorId_Falha() {
        // Arrange
        when(usuarioRepository.findById(1L)).thenReturn(Optional.empty());
        // Act & Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
        {
            usuarioService.buscarUsuarioPorId(1L);
        });
        assertEquals("Usuário não encontrado", exception.getMessage());
        verify(usuarioRepository, times(1)).findById(1L);
    }
    @Test
        void testSalvarUsuario_ComSucesso() {
        // Arrange
        Usuario usuario = new Usuario(2L, "Maria");
        // Act
        usuarioService.salvarUsuario(usuario);

        // Assert
        verify(usuarioRepository, times(1)).save(usuario);
    }
    @Test
        void testSalvarUsuario_FalhaNomeVazio() {
        // Arrange
        Usuario usuario = new Usuario(3L, "");
        // Act & Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
        {
        usuarioService.salvarUsuario(usuario);
        });
        assertEquals("Nome do usuário é obrigatório", exception.getMessage());
        verify(usuarioRepository, never()).save(usuario);
    }
}
