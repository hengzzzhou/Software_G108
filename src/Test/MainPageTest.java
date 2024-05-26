import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import Model.Main_page_m;
import View.Main_page;
import Class.User;
import javax.swing.*;
import java.awt.*;

public class MainPageTest {
    private JFrame mockFrame;
    private Main_page mockMainPage;
    private Main_page_m mainPageModel;
    private User mockUser;
    private JLabel mockTotalAssetsLabel;
    private JButton mockGoalButton;
    private JProgressBar mockProgressBar;

    @BeforeEach
    public void setUp() {

        mockFrame = mock(JFrame.class);
        mockMainPage = mock(Main_page.class);
        mockUser = mock(User.class);
        mockTotalAssetsLabel = mock(JLabel.class);
        mockGoalButton = mock(JButton.class);
        mockProgressBar = mock(JProgressBar.class);


        mainPageModel = new Main_page_m(mockMainPage);


        when(mockMainPage.getTotalAssets()).thenReturn(mockTotalAssetsLabel);
        when(mockMainPage.getGoalButton()).thenReturn(mockGoalButton);
        when(mockMainPage.getProgressBar1()).thenReturn(mockProgressBar);


        Container mockContainer = mock(Container.class);
        when(mockFrame.getContentPane()).thenReturn(mockContainer);
    }

    @Test
    public void testInit() {
        when(mockUser.getTotal()).thenReturn(1000.0);
        when(mockUser.getProgress()).thenReturn(50);

        mainPageModel.init(mockFrame, mockUser);

        verify(mockTotalAssetsLabel).setText("$1000.0");
        verify(mockGoalButton).setText("My Goal: 50");
        verify(mockFrame.getContentPane()).add(mockMainPage);
        verify(mockFrame).repaint();
        verify(mockFrame).revalidate();
    }

    @Test
    public void testSetProgressBarValue() {
        when(mockUser.getTotal()).thenReturn(1000.0);

        mainPageModel.setProgressBarValue(mockUser, 200);

        verify(mockProgressBar).setValue(500);
    }
}
