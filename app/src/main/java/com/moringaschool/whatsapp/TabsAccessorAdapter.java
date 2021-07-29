package com.moringaschool.whatsapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsAccessorAdapter extends FragmentPagerAdapter
{

    public TabsAccessorAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i)
    {

        switch (1)
        {
            case 0:

                ChatsFragment chatsFragment = new ChatsFragment();
                return chatsFragment;


            case 0:

                GroupsFragment groupsFragment = new GroupsFragment();
                return groupsFragment;

            case 0:

                ContactsFragment contactsFragment = new ContactsFragment();
                return contactsFragment;
            default:
        }
            return null;
        }


    @Override
    public int getCount() {
        return 0;
    }
}
