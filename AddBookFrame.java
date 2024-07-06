import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBookFrame {
    private JFrame frame;
    private JTextField titleField;
    private JTextField authorField;

    public AddBookFrame() {
        frame = new JFrame("Add Book");
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(3, 2));

        JLabel titleLabel = new JLabel("Title:");
        titleField = new JTextField();
        JLabel authorLabel = new JLabel("Author:");
        authorField = new JTextField();

        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String title = titleField.getText();
                String author = authorField.getText();
                Library.addBook(new Book(title, author));
                JOptionPane.showMessageDialog(frame, "Book added: " + title + " by " + author);
                frame.dispose();
            }
        });

        frame.add(titleLabel);
        frame.add(titleField);
        frame.add(authorLabel);
        frame.add(authorField);
        frame.add(new JLabel()); // Empty cell
        frame.add(addButton);

        frame.setVisible(true);
    }
}
