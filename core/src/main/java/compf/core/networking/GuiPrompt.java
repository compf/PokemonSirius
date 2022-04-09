package compf.core.networking;

import compf.core.engine.BattleRoundResult;
import compf.core.engine.BattleState;
import compf.core.engine.PlayerInput;
import compf.core.engine.PokemonBattle;
import compf.core.engine.pokemon.Pokemon;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.BiPredicate;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;



/*public class GuiPrompt implements  IOInterface {
	private int _lastIndex;
	public class SimpleListener implements MouseListener{
		@Override
		public void mouseClicked(MouseEvent e) {
			var btn=(JButton)e.getSource();
			_lastIndex=_buttonIdMap.get(btn);
			_buttons.removeAll();
			_buttons.revalidate();
			_buttons.repaint();
			synchronized(GuiPrompt.this) {
				GuiPrompt.this.notifyAll();
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	@Override
	public int prompt(String prompt, String... args) {
		this.prompt(prompt);
		int index=0;
		for(String item:args) {
			if(true) {
				JButton btn=new JButton();
				btn.setToolTipText(index+"");
				_buttonIdMap.put(btn, index);
				btn.setText(item);
				btn.addMouseListener(new SimpleListener() );
				index++;
				
				_buttons.add(btn);
			}
			
		}
		SwingUtilities.invokeLater(()->{_buttons.validate();});
		safeWait();
		return _lastIndex;
	}
	public synchronized void safeWait() {
		try {
			updatePokemon(false);
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateUI() {
		
	}
	@Override
	public int prompt(String prompt, IPrompt<Integer> promptHelper, int begin, int[] args) {
		this.prompt(prompt);
		int index=0;
		for(int item:args) {
			if(true) {
				JButton btn=new JButton();
				btn.setToolTipText(index+"");
				_buttonIdMap.put(btn, index);
				btn.setText(promptHelper.prompt(item, index));
				btn.addMouseListener(new SimpleListener() );
				index++;
				_buttons.add(btn);
			}
			
		}
		SwingUtilities.invokeLater(()->{_buttons.validate();});
		safeWait();
		return _lastIndex;
	}

	@Override
	public void prompt(String prompt) {

		if(_messages.getText()==null) {
			_messages.setText(prompt);
		}
		else {
			_messages.setText(_messages.getText()+"\n"+prompt);
		}
		
		
	
		//SwingUtilities.invokeLater(()->{_lbMessages.validate();});

	}
	
	@Override
	public <T> int prompt(String prompt, IPrompt<T> promptHelper, BiPredicate<Integer, T> test, T... args) {
		this.prompt(prompt);
		int index=0;
		for(T item:args) {
			if(test.test(index, item)) {
				JButton btn=new JButton();
				btn.setToolTipText(index+"");
				_buttonIdMap.put(btn, index);
				btn.setText(promptHelper.prompt(item, index));
				btn.addMouseListener(new SimpleListener() );
				index++;
				_buttons.add(btn);
			}
			
		}
		SwingUtilities.invokeLater(()->{_buttons.validate();});
		safeWait();
		return _lastIndex;
	}

	@Override
	public <T> int prompt(String prompt, IPrompt<T> promptHelper, T... args) {
		this.prompt(prompt);
		int index=0;
		for(T item:args) {
			
				JButton btn=new JButton();
				_buttonIdMap.put(btn, index);
				btn.setToolTipText(index+"");
				btn.setText(promptHelper.prompt(item, index));
				btn.addMouseListener(new SimpleListener() );
				index++;
				_buttons.add(btn);
			
			
		}
		SwingUtilities.invokeLater(()->{_buttons.validate();});
		safeWait();
		return _lastIndex;
	}

	@Override
	public <T> int prompt(String prompt, IPrompt<T> promptHelper, ArrayList<T> args) {
		this.prompt(prompt);
		// TODO Auto-generated method stub
		int index=0;
		for(T item:args) {
			if(true) {
				JButton btn=new JButton();
				btn.setToolTipText(index+"");
				btn.setText(promptHelper.prompt(item, index));
				btn.addMouseListener(new SimpleListener() );
				index++;
				_buttons.add(btn);
			}
			
		}
		SwingUtilities.invokeLater(()->{_buttons.validate();});
		safeWait();
		return _lastIndex;
	}

	
	/*
	 *

	private Frame _win;
	private JPanel _buttons;
	private JTextArea _messages;
	private JPanel _battleGrid;
	private final HashMap<Object,Integer> _buttonIdMap=new HashMap<>();
	private ArrayList<JPanel> _pokemonPanels=new ArrayList<>(6*4);
	

	public void init() {
		_win = new Frame();
		_win.setSize(800, 700);
		_win.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				e.getWindow().dispose(); // Fenster "killen"
				System.exit(0); // VM "killen"
			}
		});
		_win.setVisible(true);
		;

		initWindow();
	}
	public void updatePokemon(boolean create) {
		JPanel main=null;;
		JProgressBar hpBar=null;;
		JLabel pict=null;
		JLabel hp=null,name=null;
		int index=0;
		
		for(var pkmn: PokemonBattle.Battle) {
			if(create) {
				main=new JPanel();
				main.setLayout(new BoxLayout(main,BoxLayout.Y_AXIS));
				main.setSize(100,1000);
				name=new JLabel();
				
				hpBar=new JProgressBar();
				hpBar.setSize(100, 20);
				main.add(name);
				main.add(hpBar);
				_battleGrid.add(main);
				_pokemonPanels.add(main);
				pict=new JLabel();
				pict.setSize(120,500);
				main.add(pict);
				hpBar.setMaximum(pkmn.getStat(0));
				
				
				
			}
			else {
				main=_pokemonPanels.get(index);
				name=(JLabel)main.getComponents()[0];
				hpBar=(JProgressBar)main.getComponents()[1];
				pict=(JLabel)main.getComponents()[2];
			}
			name.setText(pkmn.getName());
		
			hpBar.setValue(pkmn.getCurrHP());
			Color col=null;
			double perc=((double)pkmn.getCurrHP())/pkmn.getStat(0);
			if(perc>=0.5) {
				col=Color.green;
			}
			else if(perc>=0.25) {
				col=Color.orange;
			}
			else {
				col=Color.red;
			}
			index++;
			hpBar.setStringPainted(true);
			hpBar.setForeground(col);
			hpBar.setString(pkmn.getCurrHP()+"");
			 BufferedImage myPicture;
			try {
				myPicture = ImageIO.read(new File("res/pokemon/main-sprites/diamond-pearl/"+pkmn.getNr()+".png"));
				pict.setIcon(new ImageIcon(myPicture));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			_battleGrid.revalidate();
		
		}
	}
	
	private void updateHPBar(JProgressBar hpBar, Pokemon pkmn) {
		
		
	}
	private void initWindow() {

		_win.setLayout(new GridLayout(1,3));
		_buttons = new JPanel();
		_buttons.setLayout(new BoxLayout(_buttons, BoxLayout.Y_AXIS));
		_buttons.setSize(400, 800);
		
		_win.add(_buttons);
	
		_messages=new JTextArea();
		_messages.setSize(500, 800);
		JScrollPane sp=new JScrollPane(_messages);
		_messages.setLineWrap(true);
		_messages.setWrapStyleWord(true);
		_messages.setText("");
		_win.add(sp);
		_battleGrid = new JPanel();
		
		_battleGrid.setLayout(new GridLayout(8, 8));
		_win.add(_battleGrid);
		updatePokemon(true);
		_win.validate();
		//_initFinnished=true;

	}
	@Override
	public void message(String msg) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(BattleRoundResult state) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setLock(boolean val) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public PlayerInput requestPlayerInput(short  pkmnIndex, BattleState state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public short switchPokemon(BattleState state,short oldIndex) {
		return 0;
	}

}*/
